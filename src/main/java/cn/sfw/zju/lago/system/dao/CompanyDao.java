package cn.sfw.zju.lago.system.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {
	public List<Map<String, Object>> getByCmpFncStage(Map<String, Object> parmMap);
}