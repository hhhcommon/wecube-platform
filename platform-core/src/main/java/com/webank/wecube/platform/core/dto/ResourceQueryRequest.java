package com.webank.wecube.platform.core.dto;

public class ResourceQueryRequest {
    private PageableDto pageable = new PageableDto();
    
    public PageableDto getPageable() {
        return pageable;
    }
    public void setPageable(PageableDto pageable) {
        this.pageable = pageable;
    }

}
