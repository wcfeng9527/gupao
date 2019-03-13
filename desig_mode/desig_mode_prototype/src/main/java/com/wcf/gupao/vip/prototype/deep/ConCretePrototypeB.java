package com.wcf.gupao.vip.prototype.deep;

import com.wcf.gupao.vip.prototype.Prototype;

import java.io.*;

/**
 * 深克隆
 *
 * @author wangchunfeng
 * @create 2019-03-11 17:52
 */
public class ConCretePrototypeB extends Prototype implements Serializable {

    @Override
    public Prototype clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();
            
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Prototype)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
