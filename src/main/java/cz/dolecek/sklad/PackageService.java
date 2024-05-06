package cz.dolecek.sklad;
import Repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public class PackageService {


    public Object getPackage(long id) {
        return null;
    }

    @Service
    public class ProductService {

        private final PackageRepository produktRepository;


        public ProductService(PackageRepository produktRepository) {
            this.produktRepository = produktRepository;
        }

        public List<Package> getAllProducts() {
            return produktRepository.findAll();
        }

        public Optional<Package> getProductById(Long id) {
            return produktRepository.findById(id);
        }

        public Package saveProduct(Package produkt) {
            return produktRepository.save(produkt);
        }

        public void deleteProduct(Long id) {
            produktRepository.deleteById(id);
        }
    }

}
