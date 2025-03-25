package com.example.demo.data;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class DataController {
    // 데이터 조회에 대한 요청이 발생했음을 알리는 기능
    @RequestMapping(value = "/data/{dataID}", method = RequestMethod.GET)
    public ResponseEntity<?> readData(
            @PathVariable(value = "dataID") String dataID
    ) {
        String message = dataID + " 조회에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    // 데이터 검색에 대한 요청이 발생했음을 알리는 기능
    @GetMapping(value = "/data")
    public ResponseEntity<?> searchData(
            @RequestParam(value = "title") String title
    ) {
        String message = title + " 검색에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    // 데이터 생성에 대한 요청이 발생했음을 알리는 기능
    @PostMapping(value = "/data")
    public ResponseEntity<?> createData(
            @RequestBody String data
    ) {
        String message = data + " 생성에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }
    // 데이터 덮어쓰기 또는 생성에 대한 요청이 발생했음을 알리는 기능
    @PutMapping(value = "/data/{dataID}")
    public ResponseEntity<?> updateData(
            @PathVariable(value = "dataID") String dataID,
            @RequestBody String data
    ) {
        String message = dataID + "에 대해 " + data + " 덮어쓰기 또는 생성에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    // 데이터 부분 수정에 대한 요청이 발생했음을 알리는 기능
    @PatchMapping(value = "/data/{dataID}")
    public ResponseEntity<?> modifyData(
            @PathVariable(value = "dataID") String dataID,
            @RequestBody String data
    ) {
        String message = dataID + "에 대해 " + data + " 부분 수정에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    // 데이터 삭제에 대한 요청이 발생했음을 알리는 기능
    @DeleteMapping(value = "/data/{dataID}")
    public ResponseEntity<?> deleteData(
            @PathVariable(value = "dataID") String dataID
    ) {
        String message = dataID + " 삭제에 대한 요청이 발생했음.";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}
