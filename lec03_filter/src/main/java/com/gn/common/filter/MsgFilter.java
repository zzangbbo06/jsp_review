package com.gn.common.filter;

import java.io.IOException;

import com.gn.common.wrapper.MsgRequestWrapper;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/receive/*")
// 반드시 이 부분을 적어야 filter가 작용
public class MsgFilter implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// ServletRequest는 HttpServletRequest의 부모
		MsgRequestWrapper wrapped = new MsgRequestWrapper((HttpServletRequest)arg0);
		// 부모에는 HttpServletRequest가 없기 때문에 강제로 다운캐스팅하여 사용
		arg2.doFilter(wrapped, arg1);
		
	}

}
