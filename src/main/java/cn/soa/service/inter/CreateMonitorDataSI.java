package cn.soa.service.inter;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface CreateMonitorDataSI {

	Map<String, Object> createMonitorData(List<String> params);

	Map<String, Object> createTMonitorData(List<String> params);

}
