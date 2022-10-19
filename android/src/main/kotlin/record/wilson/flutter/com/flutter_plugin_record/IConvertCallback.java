package record.wilson.flutter.com.flutter_plugin_record;

import java.io.File;

public interface IConvertCallback {
    
    void onSuccess(File convertedFile);
    
    void onFailure(Exception error);

}