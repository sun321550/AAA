package com.sun;



import java.util.Random;
import java.util.Scanner;


    public class Text5 {
        public static void main(String[] args) {
            String str = random();
            System.out.println("验证码为:" + str);
            System.out.println("请输入上述验证码:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (str.toUpperCase().equals(input.toUpperCase())) {
                System.out.println("验证码正确");
            } else {
                System.out.println("验证码错误");
            }

        }

        /**
         * 生成验证码
         *
         * @return
         */
        public static String random() {
            Random random = new Random();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                if (random.nextInt(2) == 1) {
                    builder.append((char) ('a' + random.nextInt(27)));
                } else {
                    builder.append((char) ('A' + random.nextInt(27)));
                }
            }
            return builder.toString();
        }
    }

