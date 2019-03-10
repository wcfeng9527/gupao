package com.wcf.gupao.vip.singleton.seriable;

import java.io.*;

/**
 * @author wangchunfeng
 * @create 2019-03-10 18:09
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton obj1 = SeriableSingleton.getInstance();
        SeriableSingleton obj2 = null;
        try {

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj1);
            obs.flush();
            obs.close();


            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream obi = new ObjectInputStream(in);
            obj2 = (SeriableSingleton)obi.readObject();
            obi.close();
            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj1 == obj2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
