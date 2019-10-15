package business.Impl;

import java.util.List;









import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TAnswer;
import business.DAO.AnswerDAO;
/**
 * 回答接口实现类
 * @author Aicken
 *
 */
public class AnswerImpl implements AnswerDAO {
	private iHibBaseDAO bdao;

	public AnswerImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean insert(TAnswer answer) {
		Integer id= (Integer) bdao.insert(answer);
		if (id!=null  && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public TAnswer select(int TAnswerid) {
		 
		return (TAnswer) bdao.findById(TAnswer.class, TAnswerid);
	}

	@Override
	public List<TAnswer> select() {
		return 	bdao.select("from TAnswer");
	}

	@Override
	public int getAnswerAmount(String wherecondition) {
		String hql="from TAnswer ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<TAnswer> getAnswerByLike(String likecondtion, int currentPage,
			int pageSize) {
		String hql = "from TAnswer";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		hql += " order by createTime asc";
		return	  bdao.selectByPage(hql, currentPage, pageSize);
		 
	}

	
}
