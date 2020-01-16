package com.mall.search.repository;

import com.mall.search.entity.ItemDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<ItemDocument, Integer> {
}
