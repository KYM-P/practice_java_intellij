package InputOutput;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class InputOutput_StramReader { // byte 단위 스트림을 문자(char)로 변환
    InputStreamReader is = new InputStreamReader(System.in);
    OutputStreamWriter os = new OutputStreamWriter(System.out);
}
