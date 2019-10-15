package business.Impl;

import java.util.List;




import Model.TAnswer;
import business.DAO.AnswerDAO;
/**
 * 回答接口实现类
 * @author Aicken
 *
 */
public class AnswerImpl implements AnswerDAO {

	@Override
	public boolean insert(TAnswer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TAnswer select(int TAnswerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TAnswer> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAnswerAmount(String wherecondition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TAnswer> getAnswerByLike(String likecondtion, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
