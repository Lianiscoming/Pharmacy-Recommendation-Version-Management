package com.example.project3.api.service

import com.example.project3.AbstractIntegrationContainerBaseTest
import com.example.project3.api.dto.KakaoApiResponseDto
import org.springframework.beans.factory.annotation.Autowired

class KakaoAddressSearchServiceTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private KakaoAddressSearchService kakaoAddressSearchService

    def "address 파라미터 값이 null이면, requestAddressSearch 매소드는 null을 리턴한다." () {
        given:
        String address = null

        when:
        def result = kakaoAddressSearchService.requestAddressSearch(address)

        then:
        result == null
    }

    def "주소값이 valid 하다면, requestAddressSearch 메소드는 정상적으로 document를 반환한다." () {
        given:
        def address = "경기도 성남시 분당구 동판교로 212"

        when:
        def result = kakaoAddressSearchService.requestAddressSearch(address)


        then:
        // result.documentDtoList.size() > 0
        result.metaDto.totalCount > 0
        // result.documentDtoList.get(0).addressName != null
        result.getDocumentDtoList().size() > 0


    }
}
