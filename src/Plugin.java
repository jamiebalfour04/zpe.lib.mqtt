import jamiebalfour.zpe.core.ZPEModule;
import jamiebalfour.zpe.core.ZPEStructure;
import jamiebalfour.zpe.core.interfaces.ZPECustomFunction;
import jamiebalfour.zpe.core.interfaces.ZPELibrary;

import java.util.HashMap;
import java.util.Map;

public class Plugin implements ZPELibrary {

  @Override
  public Map<String, ZPECustomFunction> getFunctions() {
    return new HashMap<>();
  }

  @Override
  public Map<String, Class<? extends ZPEStructure>> getObjects() {
    Map<String, Class<? extends ZPEStructure>> m = new HashMap<>();
    m.put("mqtt", MQTTObject.class);

    return m;
  }

  @Override
  public Map<String, ZPEModule> getModules() {
    return new HashMap<>();
  }

  @Override
  public boolean supportsWindows() {
    return true;
  }

  @Override
  public boolean supportsMacOs() {
    return true;
  }

  @Override
  public boolean supportsLinux() {
    return true;
  }

  @Override
  public String getName() {
    return "libMQTT";
  }

  @Override
  public String getVersionInfo() {
    return "1.0";
  }
}