package business.DAO;

import java.util.List;

import Model.TClass;
import Model.VClass;

/***
 * 
 * @author Aicken 班级模块接口设计
 */
public interface ClassDAO {
	/**
	 * 添加班级
	 * 
	 * @param tclass
	 *            班级实体
	 * @return 返回班级主键
	 */
	public boolean Insert(TClass tclass);

	/**
	 * 删除班级
	 * 
	 * @param tclassid
	 *            班级id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int tclassid);

	/**
	 * 更改班级
	 * 
	 * @param TClass
	 *            班级实体
	 * @return true 成功 false 失败
	 */
	public boolean update(TClass TClass);

	/**
	 * 根据id查询 班级
	 * 
	 * @return 班级数据实体
	 */
	public TClass select(int TClassid);

	/**
	 * 根据id查询 班级视图
	 * 
	 * @return 班级数据实体
	 */
	public VClass selectVclass(int VClassid);

	/**
	 * 查询所有班级
	 * 
	 * @return 班级数据集
	 */
	public List<VClass> select();

	/**
	 * 根据条件获取符合条件的班级的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getVClassAmount(String wherecondition);

	/**
	 * 根据条件查询班级
	 * 
	 * @param likecondtion
	 *            条件
	 * @param currentPage
	 *            开始页数
	 * @param pageSize
	 *            每页数量
	 * @return 班级数据集
	 */
	public List<VClass> getVClassByLike(String likecondtion, int currentPage,
			int pageSize);
}
