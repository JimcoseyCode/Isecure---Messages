.class final Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/domain/ContactRepository;->getFieldFromContacts-m7AL99Q(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "T",
        "LR8/N;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.domain.ContactRepository$getFieldFromContacts$2"
    f = "ContactRepository.kt"
    l = {
        0xfa
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contactId:Ljava/lang/String;

.field final synthetic $extractableField:Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts<",
            "TT;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method constructor <init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$extractableField:Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$contactId:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$extractableField:Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$contactId:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LR8/N;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object v9, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, LR8/N;

    .line 35
    .line 36
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 37
    .line 38
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-object v4, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    .line 43
    .line 44
    const-string v1, "CONTENT_URI"

    .line 45
    .line 46
    invoke-static {v4, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$extractableField:Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;

    .line 50
    .line 51
    invoke-interface {v1}, Lexpo/modules/contacts/next/domain/model/ExtractableField;->getProjection()[Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$contactId:Ljava/lang/String;

    .line 56
    .line 57
    filled-new-array {v1}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->label:I

    .line 64
    .line 65
    const-string v6, "_id = ?"

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    const/16 v10, 0x10

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    move-object v9, p0

    .line 72
    invoke-static/range {v3 .. v11}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery$default(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-ne v1, v0, :cond_2

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_2
    move-object v0, p1

    .line 80
    move-object p1, v1

    .line 81
    :goto_0
    check-cast p1, Ljava/io/Closeable;

    .line 82
    .line 83
    iget-object v1, v9, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;->$extractableField:Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;

    .line 84
    .line 85
    :try_start_0
    move-object v2, p1

    .line 86
    check-cast v2, Landroid/database/Cursor;

    .line 87
    .line 88
    invoke-static {v0}, LR8/O;->d(LR8/N;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->Companion:Lexpo/modules/contacts/next/domain/query/QueryAggregator$Companion;

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lexpo/modules/contacts/next/domain/query/QueryAggregator$Companion;->aggregateOneFieldFromContacts(Landroid/database/Cursor;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;)Lexpo/modules/contacts/next/domain/model/Extractable;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object v1, v0

    .line 104
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw v0
.end method
