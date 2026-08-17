.class public interface abstract Lexpo/modules/contacts/next/domain/model/Updatable;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;,
        Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0002\u0008\tJ\u0008\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/Updatable;",
        "",
        "contentValues",
        "Landroid/content/ContentValues;",
        "getContentValues",
        "()Landroid/content/ContentValues;",
        "toUpdateOperation",
        "Landroid/content/ContentProviderOperation;",
        "Contacts",
        "Data",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getContentValues()Landroid/content/ContentValues;
.end method

.method public abstract toUpdateOperation()Landroid/content/ContentProviderOperation;
.end method
