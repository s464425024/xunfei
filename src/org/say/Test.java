package org.say;

import com.iflytek.cloud.speech.*;

/**
 * Created by songchaoyue on 2016/12/16.
 */
public class Test {
    public static void main(String[] args) {
        SpeechUtility utility = SpeechUtility.createUtility(SpeechConstant.APPID +"=58537b14");
        SpeechRecognizer mIat= SpeechRecognizer.createRecognizer( );
        //2.设置听写参数，详见《iFlytek MSC Reference Manual》SpeechConstant类
        mIat.setParameter(SpeechConstant.DOMAIN, "iat");
        mIat.setParameter(SpeechConstant.LANGUAGE, "zh_cn");
        mIat.setParameter(SpeechConstant.ACCENT, "mandarin ");
        RecognizerListener mRecoListener = new RecognizerListenerImpl();
        //3.开始听写
        mIat.startListening(mRecoListener);
     }
}
