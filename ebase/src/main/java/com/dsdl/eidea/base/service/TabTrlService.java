/**
* 版权所有 刘大磊 2013-07-01
* 作者：刘大磊
* 电话：13336390671
* email:ldlqdsd@126.com
*/
package com.dsdl.eidea.base.service;
import com.dsdl.eidea.base.entity.po.TabTrlPo;
import com.dsdl.eidea.core.dto.PaginationResult;
import com.dsdl.eidea.core.params.QueryParams;
import com.googlecode.genericdao.search.Search;
import java.util.List;

/**
 * @author 刘大磊 2017-05-02 15:43:44
 */
public interface TabTrlService {
	PaginationResult<TabTrlPo> getTabTrlListByPaging(Search search,QueryParams queryParams);
	PaginationResult<TabTrlPo> getTabTrlListByTabId(Search search,Integer tabId);
	TabTrlPo getTabTrl(Integer id);
	void saveTabTrl(TabTrlPo tabTrl);
	void deletes(Integer[] ids);
}