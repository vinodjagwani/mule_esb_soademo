package org.mule.soademo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.activation.DataHandler;
import javax.imageio.ImageIO;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transport.http.multipart.MultiPartInputStream.MultiPart;
import org.mule.transport.http.multipart.PartDataSource;

public class FileToInputStream extends AbstractMessageTransformer {
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		try {
			
			
			Map<String, String> map = (Map)message.getPayload();
			System.out.println(map);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "VINOD";
	}
}
