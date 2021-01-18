package com.luqiao.interf.util;

import java.io.*;
import java.net.*;
import java.util.Iterator;
import java.util.Map;

public class MyHttpUtils {
    /**
     * Get Request
     *
     * @return
     * @throws Exception
     */
    public static String get(String url) throws Exception {
        URL localURL = new URL(url);
        URLConnection connection = localURL.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

        httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        StringBuffer resultBuffer = new StringBuffer();
        String tempLine = null;

        if (httpURLConnection.getResponseCode() >= 300) {
            throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
        }

        try {
            inputStream = httpURLConnection.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);

            while ((tempLine = reader.readLine()) != null) {
                resultBuffer.append(tempLine);
            }

        } finally {

            if (reader != null) {
                reader.close();
            }

            if (inputStreamReader != null) {
                inputStreamReader.close();
            }

            if (inputStream != null) {
                inputStream.close();
            }

        }

        return resultBuffer.toString();
    }


    public static String post(String url, Map<String, Object> paramMap) {
        PrintWriter out = null;
        InputStream in = null;
        String result = "";
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Charset", "UTF-8");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setConnectTimeout(5000);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());

            // 设置请求属性
            String param = "";
            if (paramMap != null && paramMap.size() > 0) {
                Iterator<String> ite = paramMap.keySet().iterator();
                while (ite.hasNext()) {
                    String key = ite.next();// key
                    String value = paramMap.get(key).toString();
                    param += key + "=" + value + "&";
                }
                param = param.substring(0, param.length() - 1);
            }

            // 发送请求参数
            out.print(param);

            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = conn.getInputStream();

            byte[] data = new byte[102400];
            int len = 0;
            while ((len = in.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, len);
            }
            result = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (Exception e) {
            System.err.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return result;
    }

    /**
     * 发送body参数
     *
     * @param url
     * @param
     * @param bodyStr
     * @return
     */
    public static String postBody(String url, String bodyStr) {
        PrintWriter out = null;
        InputStream in = null;
        String result = "";
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();

            // 设置通用的请求属性
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // 设置发送数据的格式
            conn.setRequestProperty("Charset", "UTF-8");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setConnectTimeout(5000);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 把数据写入请求的Body
            out.write(bodyStr);

            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = conn.getInputStream();

            byte[] data = new byte[102400];
            int len = 0;
            while ((len = in.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, len);
            }
            result = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (Exception e) {
            System.err.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return result;
    }

//
//    public static void main(String[] args) {
//        String url = "https://archive.fm1039.com.cn/repository/9debe708c1a958f17108ec1e8aef3e3c";
//
//
//        Map<String, Object> map = new HashMap<>();
//
//        long timestamp = DateUtil.getTimeStamp10();
//
//        map.put("size", 100);
//        map.put("next", 0);
//        map.put("timestamp", timestamp);
//        map.put("nonce", UUID.randomUUID().toString());
//
//
//        String sign = CommonEncryptUtils.getSignature(map, Const.SIGN_PARAMS_PULL, "F8c1F2c6E122FC5544Be3A8f06A8A265");
//        System.out.println("通过接收到的参数获取signature ==>>" + sign);
//
//        map.put("signature", sign);
//        System.out.println(post(url, map));
//
//    }
}
