package ru.yandex.practicum.contacts.presentation.main;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;

import ru.yandex.practicum.contacts.model.ContactType;
import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;



public class ContactUi implements ListDiffInterface<ContactUi> {

    private final String name;
    private final String phone;
    private final String photo;
    private final List<ContactType> types;

    public ContactUi(
            @NonNull String name,
            @NonNull String phone,
            @NonNull String photo,
            @NonNull List<ContactType> types
    ) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
        this.types = types;
    }

    @NonNull
    public String getName() {
        return name;
    }
    @NonNull
    public  String getPhone() {
        return phone;
    }
    @NonNull
    public String getPhoto() {
        return photo;
    }
    @NonNull
    public List<ContactType> getTypes() {
        return types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactUi)) return false;
        ContactUi other = (ContactUi) o;
        return name.equals(other.name) &&
                phone.equals(other.phone) &&
                photo.equals(other.photo) &&
                types.equals(other.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, photo, types);
    }

    @Override
    public boolean theSameAs(ContactUi other) {
        if (other == null) {
            return false;
        }
        return this.name.equals(other.name) &&
                this.phone.equals(other.phone) &&
                this.photo.equals(other.photo) &&
                this.types.equals(other.types);
    }
}