package com.fii.taip.msn.dbcom;

import com.fii.taip.msn.dto.FacebookUserTokenDto;

public interface FacebookTokenRepository {
	
	void insert(final FacebookUserTokenDto token);
	
}
