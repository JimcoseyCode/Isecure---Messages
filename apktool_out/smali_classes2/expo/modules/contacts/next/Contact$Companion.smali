.class public final Lexpo/modules/contacts/next/Contact$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/contacts/next/Contact;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J0\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J>\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008$\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/contacts/next/Contact$Companion;",
        "",
        "<init>",
        "()V",
        "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;",
        "createContactRecord",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "contactRepository",
        "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "contactMapper",
        "Lexpo/modules/contacts/next/ContactFactory;",
        "contactFactory",
        "Lexpo/modules/contacts/next/Contact;",
        "create",
        "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
        "contactIntentDelegate",
        "",
        "presentCreateForm",
        "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/records/ContactQueryOptions;",
        "contactQueryOptions",
        "",
        "getAll",
        "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/ContactFactory;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;",
        "",
        "Lexpo/modules/contacts/next/records/fields/ContactField;",
        "fields",
        "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
        "getAllWithDetails",
        "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Ljava/util/Set;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;",
        "presentPicker",
        "(Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;",
        "hasAny",
        "(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)Ljava/lang/Object;",
        "",
        "getCount",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/Contact$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
            "Lexpo/modules/contacts/next/ContactFactory;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Lexpo/modules/contacts/next/Contact$Companion$create$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lexpo/modules/contacts/next/Contact$Companion$create$1;-><init>(Lexpo/modules/contacts/next/Contact$Companion;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p4, p1

    .line 41
    check-cast p4, Lexpo/modules/contacts/next/ContactFactory;

    .line 42
    .line 43
    invoke-static {p5}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p5, Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 47
    .line 48
    invoke-virtual {p5}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->unbox-impl()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p5}, Li7/p;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toDomain(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/contact/NewContact;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p4, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput v3, v0, Lexpo/modules/contacts/next/Contact$Companion$create$1;->label:I

    .line 71
    .line 72
    invoke-virtual {p2, p1, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->insert-Hoartsk(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Ln7/f;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p4, p1}, Lexpo/modules/contacts/next/ContactFactory;->create-kDnipiQ(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method public final getAll(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/ContactFactory;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Lexpo/modules/contacts/next/ContactFactory;",
            "Lexpo/modules/contacts/next/records/ContactQueryOptions;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;-><init>(Lexpo/modules/contacts/next/Contact$Companion;Ln7/f;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->label:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v6, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    move-object p2, p1

    .line 43
    check-cast p2, Lexpo/modules/contacts/next/ContactFactory;

    .line 44
    .line 45
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_5

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    invoke-virtual {p3}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getLimit()Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-object v1, p4

    .line 69
    :goto_2
    if-eqz p3, :cond_4

    .line 70
    .line 71
    invoke-virtual {p3}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getOffset()Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    move-object v3, p4

    .line 77
    :goto_3
    if-eqz p3, :cond_5

    .line 78
    .line 79
    invoke-virtual {p3}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move-object v4, p4

    .line 85
    :goto_4
    if-eqz p3, :cond_6

    .line 86
    .line 87
    invoke-virtual {p3}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getSortOrder()Lexpo/modules/contacts/next/records/SortOrder;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    :cond_6
    move-object v5, p4

    .line 92
    iput-object p2, v6, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput v2, v6, Lexpo/modules/contacts/next/Contact$Companion$getAll$1;->label:I

    .line 95
    .line 96
    move-object v2, v1

    .line 97
    move-object v1, p1

    .line 98
    invoke-virtual/range {v1 .. v6}, Lexpo/modules/contacts/next/domain/ContactRepository;->getAllIds(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p4

    .line 102
    if-ne p4, v0, :cond_7

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_7
    :goto_5
    check-cast p4, Ljava/lang/Iterable;

    .line 106
    .line 107
    new-instance p1, Ljava/util/ArrayList;

    .line 108
    .line 109
    const/16 p3, 0xa

    .line 110
    .line 111
    invoke-static {p4, p3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    :goto_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result p4

    .line 126
    if-eqz p4, :cond_8

    .line 127
    .line 128
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    check-cast p4, Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 133
    .line 134
    invoke-virtual {p4}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->unbox-impl()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    invoke-virtual {p2, p4}, Lexpo/modules/contacts/next/ContactFactory;->create-kDnipiQ(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    return-object p1
.end method

.method public final getAllWithDetails(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Ljava/util/Set;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/records/fields/ContactField;",
            ">;",
            "Lexpo/modules/contacts/next/records/ContactQueryOptions;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;-><init>(Lexpo/modules/contacts/next/Contact$Companion;Ln7/f;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v7, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v7, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->label:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v7, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    move-object p2, p1

    .line 43
    check-cast p2, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 44
    .line 45
    invoke-static {p5}, Li7/p;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_5

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p5}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toExtractableFields(Ljava/util/Collection;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-static {p3}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    const/4 p5, 0x0

    .line 69
    if-eqz p4, :cond_3

    .line 70
    .line 71
    invoke-virtual {p4}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getLimit()Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object v3, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object v3, p5

    .line 78
    :goto_2
    if-eqz p4, :cond_4

    .line 79
    .line 80
    invoke-virtual {p4}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getOffset()Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v4, v1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object v4, p5

    .line 87
    :goto_3
    if-eqz p4, :cond_5

    .line 88
    .line 89
    invoke-virtual {p4}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move-object v5, v1

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move-object v5, p5

    .line 96
    :goto_4
    if-eqz p4, :cond_6

    .line 97
    .line 98
    invoke-virtual {p4}, Lexpo/modules/contacts/next/records/ContactQueryOptions;->getSortOrder()Lexpo/modules/contacts/next/records/SortOrder;

    .line 99
    .line 100
    .line 101
    move-result-object p5

    .line 102
    :cond_6
    move-object v6, p5

    .line 103
    iput-object p2, v7, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput v2, v7, Lexpo/modules/contacts/next/Contact$Companion$getAllWithDetails$1;->label:I

    .line 106
    .line 107
    move-object v1, p1

    .line 108
    move-object v2, p3

    .line 109
    invoke-virtual/range {v1 .. v7}, Lexpo/modules/contacts/next/domain/ContactRepository;->getAllPaginated(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p5

    .line 113
    if-ne p5, v0, :cond_7

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_7
    :goto_5
    check-cast p5, Ljava/lang/Iterable;

    .line 117
    .line 118
    new-instance p1, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/16 p3, 0xa

    .line 121
    .line 122
    invoke-static {p5, p3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    :goto_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p4

    .line 137
    if-eqz p4, :cond_8

    .line 138
    .line 139
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    check-cast p4, Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;

    .line 144
    .line 145
    invoke-virtual {p2, p4}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;)Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    .line 146
    .line 147
    .line 148
    move-result-object p4

    .line 149
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_8
    return-object p1
.end method

.method public final getCount(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository;->getCount(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final hasAny(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;-><init>(Lexpo/modules/contacts/next/Contact$Companion;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lexpo/modules/contacts/next/Contact$Companion$hasAny$1;->label:I

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getCount(Ln7/f;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-ne p2, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-lez p1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/4 v3, 0x0

    .line 72
    :goto_2
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1
.end method

.method public final presentCreateForm(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;",
            "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
            "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toContentValues(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_1
    invoke-virtual {p3, p1, p4}, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->launchAddContact(Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final presentPicker(Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
            "Lexpo/modules/contacts/next/ContactFactory;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;-><init>(Lexpo/modules/contacts/next/Contact$Companion;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, Lexpo/modules/contacts/next/ContactFactory;

    .line 42
    .line 43
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, v0, Lexpo/modules/contacts/next/Contact$Companion$presentPicker$1;->label:I

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->launchPickContact(Ln7/f;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, Landroid/net/Uri;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    if-eqz p3, :cond_5

    .line 73
    .line 74
    invoke-virtual {p3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Lexpo/modules/contacts/next/ContactFactory;->create(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :cond_4
    new-instance p2, Lexpo/modules/contacts/next/UnableToExtractIdFromUriException;

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    invoke-direct {p2, p3, p1, v0, p1}, Lexpo/modules/contacts/next/UnableToExtractIdFromUriException;-><init>(Landroid/net/Uri;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    throw p2

    .line 92
    :cond_5
    return-object p1
.end method
