package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemEntityRepository extends JpaRepository<ItemJpaEntity, Long> {
}
