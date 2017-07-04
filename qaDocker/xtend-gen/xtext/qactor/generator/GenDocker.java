package xtext.qactor.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import xtext.qactor.generator.GenUtils;
import xtext.qactor.qADocker.ComponentIP;
import xtext.qactor.qADocker.Context;
import xtext.qactor.qADocker.QActorSystemSpec;

@SuppressWarnings("all")
public class GenDocker {
  public void doGenerate(final QActorSystemSpec system, final String progName) {
    EList<Context> _context = system.getContext();
    for (final Context c : _context) {
      boolean _isStandalone = c.isStandalone();
      boolean _not = (!_isStandalone);
      if (_not) {
        final String jar = (progName + "-1.0.jar");
        final String zipDir = "./";
        String _name = c.getName();
        String _applicationPackageName = GenUtils.applicationPackageName(_name);
        String _plus = (_applicationPackageName + ".Main");
        String _name_1 = c.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        String _plus_1 = (_plus + _firstUpper);
        final String zip = (_plus_1 + "-1.0.zip");
        String _name_2 = c.getName();
        String _plus_2 = ((GenUtils.rootDir + "/docker/") + _name_2);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("FROM java");
        _builder.newLine();
        _builder.append("RUN [\"apt-get\",\"install\",\"unzip\",\"-y\"]");
        _builder.newLine();
        _builder.append("COPY [\"");
        _builder.append(zipDir, "");
        _builder.append(zip, "");
        _builder.append("\",\"./\"]");
        _builder.newLineIfNotEmpty();
        _builder.append("RUN [\"unzip\",\"./");
        _builder.append(zip, "");
        _builder.append("\",\"-d\",\"./\"]");
        _builder.newLineIfNotEmpty();
        _builder.append("EXPOSE -P \"");
        ComponentIP _ip = c.getIp();
        int _port = _ip.getPort();
        _builder.append(_port, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("CMD [\"java\",\"-jar\",\"./");
        int _lastIndexOf = zip.lastIndexOf(".");
        String _substring = zip.substring(0, _lastIndexOf);
        _builder.append(_substring, "");
        _builder.append("/");
        _builder.append(jar, "");
        _builder.append("\"]");
        GenUtils.genFileDir(_plus_2, "", "Dockerfile", "", _builder);
      }
    }
  }
}
