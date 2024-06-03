import com.example.project3.pharmacy.entity.Pharmacy
import com.example.project3.pharmacy.repository.PharmacyRepository
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


class PharmacyRepositoryTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private PharmacyRepository pharmacyRepository

    def "PhamacyRepository save" () {
        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longitude = 128.1

        Pharmacy.builder()
        .pharmacyName(name)
        .pharmacyAddress(address)

    }

}