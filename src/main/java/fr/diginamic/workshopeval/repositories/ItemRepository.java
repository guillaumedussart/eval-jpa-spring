package fr.diginamic.workshopeval.repositories;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.TotalItem;
import fr.diginamic.workshopeval.entities.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    /**
     * find all by clients
     *
     * @param client client
     * @return {@link Iterable}
     * @see Iterable
     * @see Item
     */
    Iterable<Item> findAllByClients(Client client);

    /**
     * delete all by clients
     *
     * @param client client
     * @return {@link Iterable}
     * @see Iterable
     * @see Item
     * select new fr.diginamic.workshopeval.entities.TotalItem(count(*) as total,sum(i.prix) as total_price ,i.id ,i.prix as unit_price,i.description,i.code) from item i left join panier p on p.id_item=i.id left join client c on c.id=p.id_client where c.id=:id group by i.code
     */
    Iterable<Item> deleteAllByClients(Client client);

    @Query("select new fr.diginamic.workshopeval.entities.TotalItem(count(i),sum(i.price),i.id ,i.price,i.description,i.code) from Item i join  i.clients c where c.id=:id group by i.code")
    Iterable<TotalItem> findAllByClientsGroupByItems(@Param("id") Long id);
}
