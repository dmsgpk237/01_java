package com.dmsgpk.section04.use2;

public class FileSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {
        System.out.println("[" + data + "] 내용을 파일 저장에 실패했습니다.");
        return false;
    }

    // saveProvider를 상속받고, save()를 구현해라.
    // boolean -> false
    // 파일 저장에 실패했습니다.
}
