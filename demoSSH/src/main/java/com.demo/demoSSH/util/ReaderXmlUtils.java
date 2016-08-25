package com.demo.demoSSH.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ReaderXmlUtils {
    private Logger logger = LoggerFactory.getLogger(ReaderXmlUtils.class);
    private SAXReader saxReader;
    private Document doc;
    private Element root;
    private Element element;
    private ErrorCode errorCode;
    private String id;
    private String errorMessage;
    private String logMessage;
    private String flag;
    private InputStream is;
    private static final Map<String, ErrorCode> errorCodes = new HashMap<String, ErrorCode>();

    @SuppressWarnings("unchecked")
    public void readXML() {
        is = Thread.currentThread().getContextClassLoader().getResourceAsStream("异常xml的位置");
        saxReader = new SAXReader();
        Iterator<Element> i;
        Iterator<Element> childIterator;
        if (is != null) {
            try {
                doc = saxReader.read(is);
            } catch (DocumentException e) {
                logger.error(e.getMessage(),e);
            }
            root = doc.getRootElement();
        }

        if (root != null) {
            i = root.elementIterator();
            while (i.hasNext()) {
                errorCode = new ErrorCode();
                element = (Element) i.next();
                childIterator = element.elementIterator();
                id = element.attributeValue("id");
                errorCode.setErrorCodeId(id);
                while (childIterator.hasNext()) {
                    element = (Element) childIterator.next();
                    if (element.getName().equals("errorMessageKey")) {
                        errorMessage = element.getText();
                        errorCode.setErrorMessageKey(errorMessage);
                    } else if (element.getName().equals("flag")) {
                        flag = element.getText();
                        errorCode.setFlag(flag);
                    } else if (element.getName().equals("logMessage")) {
                        logMessage = element.getText();
                        errorCode.setLogMessage(logMessage);
                    }
                    errorCodes.put(id, errorCode);
                }
            }
        }
    }

    public static Map<String, ErrorCode> getErrorCodes() {
        if (errorCodes.isEmpty()) {
            ReaderXmlUtils xmlReader = new ReaderXmlUtils();
            xmlReader.readXML();
            return errorCodes;
        } else {
            return errorCodes;
        }
    }

    public static String loadXML(String fileName) {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        SAXReader reader = new SAXReader();
        Document doc = null;
        String xml = null;
        try {
            doc = reader.read(is);
            xml = doc.asXML();
        } catch (DocumentException e) {
            // no operate
        }
        return xml;
    }
}
