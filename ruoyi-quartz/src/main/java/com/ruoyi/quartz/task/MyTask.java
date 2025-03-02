package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Component
public class MyTask {

    // 向Python服务发送控制命令
    public void sendCommandToMicrocontroller(String command) {
        try {
            // 定义请求URL
            URL url = new URL("http://localhost:5000/send-command");

            // 创建连接对象并配置请求类型
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "text/plain; charset=UTF-8");

            // 发送命令数据
            try (OutputStream os = conn.getOutputStream()) {
                os.write(command.getBytes(StandardCharsets.UTF_8));
                os.flush();
                int responseCode = conn.getResponseCode();
                System.out.println("HTTP Response Code: " + responseCode);
            }
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 控制灯光
    public void ctrl(String cmd) {
        System.out.println("Controlling room light with command: " + cmd);
        sendCommandToMicrocontroller(cmd);
    }
}
