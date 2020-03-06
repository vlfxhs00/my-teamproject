package com.example.Jaecheon.service.memo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.Jaecheon.memo.dao.MemoDAO;
import com.example.Jaecheon.memo.dto.MemoDTO;

@Service
public class MemoServiceImpl implements MemoService {

	@Inject
	MemoDAO memoDao;
	
	@Override
	public List<MemoDTO> list() {
		return memoDao.list();
	}

	@Override
	public void insert(MemoDTO dto) {
		memoDao.insert(dto.getWriter(), dto.getMemo());
	}

	@Override
	public MemoDTO memo_view(int idx) {
		return memoDao.memo_view(idx);
	}

	@Override
	public void update(MemoDTO dto) {
		memoDao.update(dto);

	}

	@Override
	public void delete(int idx) {
		memoDao.delete(idx);
	}

}
