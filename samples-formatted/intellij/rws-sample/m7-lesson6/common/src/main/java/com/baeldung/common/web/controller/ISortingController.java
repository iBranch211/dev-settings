package com.baeldung.common.web.controller;

import com.baeldung.common.interfaces.IDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ISortingController<D extends IDto> {

    public List<D> findAllPaginatedAndSorted(final int page, final int size, final String sortBy, final String sortOrder);

    public List<D> findAllPaginated(final int page, final int size);

    public List<D> findAllSorted(final String sortBy, final String sortOrder);

    public List<D> findAll(final HttpServletRequest request);

}
