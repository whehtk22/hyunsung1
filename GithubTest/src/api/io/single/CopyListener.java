package api.io.single;

import java.io.File;

/**
 * ���� �����Ȳ ������
 * 
 * @author Administrator
 */
public interface CopyListener {
	void update(File origin, File dest, long copy, long total);

}
