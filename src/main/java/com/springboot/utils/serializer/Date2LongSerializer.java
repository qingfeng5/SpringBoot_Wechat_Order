package com.springboot.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * date转化成long
 * 创建时间显示的是10232312300000，后面多了几个0，而正常时没有的这里需要改成long型
 * Created by 清风
 * 2019/6/27 11:48
 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        //把date转化成long
        jsonGenerator.writeNumber(date.getTime()/1000);
    }
}
