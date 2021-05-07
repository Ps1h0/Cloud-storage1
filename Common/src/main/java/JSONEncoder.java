import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

//TODO реализовать передачу всех сообщений с помощью JSON/удалить
public class JSONEncoder extends MessageToMessageEncoder<AbstractMessage> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, AbstractMessage message, List<Object> list) throws Exception {
        System.out.println("JSONEncoder делает JSON");
        Converter converter = new Converter();
        list.add(converter.toJSON(message));
    }
}
