.class public final Lexpo/modules/contacts/ContactsModuleKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00072\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006\u001a+\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\u0008\u0000\u0010\u0010*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "onContactsChangeEventName",
        "",
        "toBundle",
        "Landroid/os/Bundle;",
        "Lexpo/modules/contacts/ContactPage;",
        "keys",
        "",
        "Lexpo/modules/contacts/Contact;",
        "defaultFields",
        "RC_EDIT_CONTACT",
        "",
        "RC_PICK_CONTACT",
        "RC_ADD_CONTACT",
        "DEFAULT_PROJECTION",
        "",
        "safeGet",
        "T",
        "",
        "",
        "key",
        "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;",
        "expo-contacts_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DEFAULT_PROJECTION:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final RC_ADD_CONTACT:I = 0x85b

.field public static final RC_EDIT_CONTACT:I = 0x859

.field public static final RC_PICK_CONTACT:I = 0x85a

.field private static final defaultFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final onContactsChangeEventName:Ljava/lang/String; = "onContactsChange"


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    const-string v27, "note"

    .line 2
    .line 3
    const-string v28, "isFavorite"

    .line 4
    .line 5
    const-string v1, "phoneNumbers"

    .line 6
    .line 7
    const-string v2, "emails"

    .line 8
    .line 9
    const-string v3, "addresses"

    .line 10
    .line 11
    const-string v4, "note"

    .line 12
    .line 13
    const-string v5, "birthday"

    .line 14
    .line 15
    const-string v6, "dates"

    .line 16
    .line 17
    const-string v7, "instantMessageAddresses"

    .line 18
    .line 19
    const-string v8, "urlAddresses"

    .line 20
    .line 21
    const-string v9, "extraNames"

    .line 22
    .line 23
    const-string v10, "relationships"

    .line 24
    .line 25
    const-string v11, "phoneticFirstName"

    .line 26
    .line 27
    const-string v12, "phoneticLastName"

    .line 28
    .line 29
    const-string v13, "phoneticMiddleName"

    .line 30
    .line 31
    const-string v14, "namePrefix"

    .line 32
    .line 33
    const-string v15, "nameSuffix"

    .line 34
    .line 35
    const-string v16, "name"

    .line 36
    .line 37
    const-string v17, "firstName"

    .line 38
    .line 39
    const-string v18, "middleName"

    .line 40
    .line 41
    const-string v19, "lastName"

    .line 42
    .line 43
    const-string v20, "nickname"

    .line 44
    .line 45
    const-string v21, "id"

    .line 46
    .line 47
    const-string v22, "jobTitle"

    .line 48
    .line 49
    const-string v23, "company"

    .line 50
    .line 51
    const-string v24, "department"

    .line 52
    .line 53
    const-string v25, "image"

    .line 54
    .line 55
    const-string v26, "imageAvailable"

    .line 56
    .line 57
    filled-new-array/range {v1 .. v28}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lj7/T;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lexpo/modules/contacts/ContactsModuleKt;->defaultFields:Ljava/util/Set;

    .line 66
    .line 67
    const-string v19, "data5"

    .line 68
    .line 69
    const-string v20, "starred"

    .line 70
    .line 71
    const-string v1, "raw_contact_id"

    .line 72
    .line 73
    const-string v2, "contact_id"

    .line 74
    .line 75
    const-string v3, "lookup"

    .line 76
    .line 77
    const-string v4, "mimetype"

    .line 78
    .line 79
    const-string v5, "display_name"

    .line 80
    .line 81
    const-string v6, "photo_uri"

    .line 82
    .line 83
    const-string v7, "photo_thumb_uri"

    .line 84
    .line 85
    const-string v8, "data1"

    .line 86
    .line 87
    const-string v9, "data2"

    .line 88
    .line 89
    const-string v10, "data5"

    .line 90
    .line 91
    const-string v11, "data3"

    .line 92
    .line 93
    const-string v12, "data4"

    .line 94
    .line 95
    const-string v13, "data6"

    .line 96
    .line 97
    const-string v14, "data7"

    .line 98
    .line 99
    const-string v15, "data8"

    .line 100
    .line 101
    const-string v16, "data9"

    .line 102
    .line 103
    const-string v17, "data1"

    .line 104
    .line 105
    const-string v18, "data4"

    .line 106
    .line 107
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lexpo/modules/contacts/ContactsModuleKt;->DEFAULT_PROJECTION:Ljava/util/List;

    .line 116
    .line 117
    return-void
.end method

.method public static final synthetic access$getDEFAULT_PROJECTION$p()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/ContactsModuleKt;->DEFAULT_PROJECTION:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDefaultFields$p()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/ContactsModuleKt;->defaultFields:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final safeGet(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :cond_0
    return-object p0
.end method

.method public static final toBundle(Lexpo/modules/contacts/Contact;Ljava/util/Set;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/Contact;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    const-string v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/Contact;->toMap(Ljava/util/Set;)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    .line 15
    invoke-static {p0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p0

    .line 16
    :cond_2
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "data"

    invoke-virtual {p1, p0, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 18
    const-string p0, "hasNextPage"

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 19
    const-string p0, "hasPreviousPage"

    invoke-virtual {p1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p1
.end method

.method public static final toBundle(Lexpo/modules/contacts/ContactPage;Ljava/util/Set;)Landroid/os/Bundle;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/ContactPage;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    const-string v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Lexpo/modules/contacts/ContactPage;->getData()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Lexpo/modules/contacts/Contact;

    .line 5
    invoke-virtual {v2, p1}, Lexpo/modules/contacts/Contact;->toMap(Ljava/util/Set;)Landroid/os/Bundle;

    move-result-object v2

    .line 6
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v1

    :cond_1
    const/4 p1, 0x0

    if-eqz p0, :cond_2

    .line 8
    invoke-virtual {p0}, Lexpo/modules/contacts/ContactPage;->getHasNextPage()Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, p1

    :goto_1
    if-eqz p0, :cond_3

    .line 9
    invoke-virtual {p0}, Lexpo/modules/contacts/ContactPage;->getHasPreviousPage()Z

    move-result p1

    .line 10
    :cond_3
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "data"

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 12
    const-string v1, "hasNextPage"

    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 13
    const-string v0, "hasPreviousPage"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p0
.end method
