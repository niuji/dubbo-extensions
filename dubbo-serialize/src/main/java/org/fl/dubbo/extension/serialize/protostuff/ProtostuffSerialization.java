package org.fl.dubbo.extension.serialize.protostuff;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.ObjectInput;
import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.serialize.Serialization;
import com.alibaba.dubbo.common.serialize.support.dubbo.GenericObjectInput;
import com.alibaba.dubbo.common.serialize.support.dubbo.GenericObjectOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * User: jiangyixin.stephen
 * Date: 2013-05-29 10:14
 */
public class ProtostuffSerialization implements Serialization {
    @Override
    public byte getContentTypeId() {
        return 127;
    }

    @Override
    public String getContentType() {
        return "x-application/protostuff";
    }

    @Override
    public ObjectOutput serialize(URL url, OutputStream out) throws IOException {
        return new ProtostuffObjectOutput(out);
    }

    @Override
    public ObjectInput deserialize(URL url, InputStream is) throws IOException {
        return new ProtostuffObjectInput(is);
    }
}
