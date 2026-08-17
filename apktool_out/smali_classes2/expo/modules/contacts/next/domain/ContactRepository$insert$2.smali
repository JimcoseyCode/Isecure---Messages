.class final Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/domain/ContactRepository;->insert-Hoartsk(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "<anonymous>",
        "(LR8/N;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.domain.ContactRepository$insert$2"
    f = "ContactRepository.kt"
    l = {
        0x24,
        0x26
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contact:Lexpo/modules/contacts/next/domain/model/contact/NewContact;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method constructor <init>(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/contact/NewContact;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->$contact:Lexpo/modules/contacts/next/domain/model/contact/NewContact;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2
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
    new-instance p1, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->$contact:Lexpo/modules/contacts/next/domain/model/contact/NewContact;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;-><init>(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->unbox-impl()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    move-object p1, v3

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->$contact:Lexpo/modules/contacts/next/domain/model/contact/NewContact;

    .line 46
    .line 47
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/NewContact;->toInsertOperations()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 52
    .line 53
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput v4, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->label:I

    .line 58
    .line 59
    const-string v5, "com.android.contacts"

    .line 60
    .line 61
    invoke-static {v1, v5, p1, p0}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeApplyBatch(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    :goto_0
    check-cast p1, [Landroid/content/ContentProviderResult;

    .line 69
    .line 70
    invoke-static {p1}, Lexpo/modules/contacts/next/extensions/ContentProviderResultExtensionsKt;->extractId([Landroid/content/ContentProviderResult;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/wrappers/RawContactId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 79
    .line 80
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput v2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;->label:I

    .line 85
    .line 86
    invoke-static {v1, p1, p0}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->getContactIdFromRawContactId-5WPtcSs(Landroid/content/ContentResolver;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_5

    .line 91
    .line 92
    :goto_1
    return-object v0

    .line 93
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->box-impl(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_6
    new-instance p1, Lexpo/modules/contacts/next/ContactIdNotFoundException;

    .line 103
    .line 104
    invoke-direct {p1, v3, v4, v3}, Lexpo/modules/contacts/next/ContactIdNotFoundException;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    throw p1
.end method
