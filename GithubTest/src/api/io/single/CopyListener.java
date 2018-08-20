package api.io.single;

import java.io.File;

/**
 * 복사 진행상황 감시자
 * 
 * @author Administrator
 */
public interface CopyListener {
	void update(File origin, File dest, long copy, long total);

}
