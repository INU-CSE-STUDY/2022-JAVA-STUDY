package inu.cse.ch08.uuuo3o;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
//            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
    }

    static void copyFiles() { /* 파일을 복사하는 코드 */}
    static void deleteTempFiles() { /* 임시파일을 삭제하는 코드 */}
    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드
        return false;
    }
    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) { super(msg); }
}