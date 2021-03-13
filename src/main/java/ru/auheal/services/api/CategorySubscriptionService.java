package ru.auheal.services.api;

import org.springframework.security.core.Authentication;
import ru.auheal.dto.CategorySubscriptionDto;
import ru.auheal.dto.CategorySubscriptionRequest;
import ru.auheal.dto.PasswordRequest;
import ru.auheal.dto.SubscriptionDto;

import java.util.List;

public interface CategorySubscriptionService {
    /**
     * Возвращает категорию абонемента по его идентификатору
     *
     * @param id идентификатор категории абонемента
     * @return dto категории абонемента
     */
    CategorySubscriptionDto getDtoById(Long id);

    /**
     * Возвращает все категории абонементов
     *
     * @return список dto категорий абонементов
     */
    List<CategorySubscriptionDto> getAllDto();

    /**
     * Создать новую категорию абонемента
     *
     * @param categorySubscriptionRequest запрос, содержащий данные абонемента
     * @param authentication данные авторизации
     * @return новый абонемент, сохраненное в репозитории
     */

    SubscriptionDto save(CategorySubscriptionRequest categorySubscriptionRequest, Authentication authentication);


    /**
     * Удалить абонемента по его идентификатору
     *
     * @param id идентификатор абонемента
     * @param authentication данные авторизации
     * @return удалено ли мероприятие
     */
    boolean deleteById(Long id, Authentication authentication);

    /**
     * Проверяет существует ли сущность.
     * @param categorySubscriptionId идентификатор абонемента
     * @return true/false
     */
    boolean exist(Long categorySubscriptionId);
}