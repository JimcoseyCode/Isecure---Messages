.class final Lexpo/modules/contacts/ContactsModule$definition$1$6$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/ContactsModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.ContactsModule$definition$1$6$1"
    f = "ContactsModule.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $options:Lexpo/modules/contacts/ContactQuery;

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/ContactsModule;


# direct methods
.method constructor <init>(Lexpo/modules/contacts/ContactQuery;Lexpo/modules/kotlin/Promise;Lexpo/modules/contacts/ContactsModule;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/ContactQuery;",
            "Lexpo/modules/kotlin/Promise;",
            "Lexpo/modules/contacts/ContactsModule;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->this$0:Lexpo/modules/contacts/ContactsModule;

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
    .locals 3
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
    new-instance p1, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->this$0:Lexpo/modules/contacts/ContactsModule;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;-><init>(Lexpo/modules/contacts/ContactQuery;Lexpo/modules/kotlin/Promise;Lexpo/modules/contacts/ContactsModule;Ln7/f;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/contacts/ContactQuery;->getId()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 27
    .line 28
    invoke-virtual {p1}, Lexpo/modules/contacts/ContactQuery;->getId()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->this$0:Lexpo/modules/contacts/ContactsModule;

    .line 33
    .line 34
    iget-object v1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v1}, Lexpo/modules/contacts/ContactQuery;->getFields()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v0, v2, v4}, Lexpo/modules/contacts/ContactsModule;->access$getContactById(Lexpo/modules/contacts/ContactsModule;Ljava/lang/String;Ljava/util/Set;)Lexpo/modules/contacts/Contact;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 72
    .line 73
    new-instance v2, Lexpo/modules/contacts/ContactPage;

    .line 74
    .line 75
    const/16 v7, 0xe

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-direct/range {v2 .. v8}, Lexpo/modules/contacts/ContactPage;-><init>(Ljava/util/List;ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 85
    .line 86
    invoke-virtual {v0}, Lexpo/modules/contacts/ContactQuery;->getFields()Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v2, v0}, Lexpo/modules/contacts/ContactsModuleKt;->toBundle(Lexpo/modules/contacts/ContactPage;Ljava/util/Set;)Landroid/os/Bundle;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Li7/B;->a:Li7/B;

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_3
    :goto_1
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 101
    .line 102
    invoke-virtual {p1}, Lexpo/modules/contacts/ContactQuery;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    invoke-static {p1}, LP8/q;->f0(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v1, "%"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->this$0:Lexpo/modules/contacts/ContactsModule;

    .line 136
    .line 137
    iget-object v1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 138
    .line 139
    invoke-virtual {v1}, Lexpo/modules/contacts/ContactQuery;->getFields()Ljava/util/Set;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v2, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 144
    .line 145
    invoke-virtual {v2}, Lexpo/modules/contacts/ContactQuery;->getSort()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v0, p1, v1, v2}, Lexpo/modules/contacts/ContactsModule;->access$getContactByName(Lexpo/modules/contacts/ContactsModule;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    :goto_2
    iget-object p1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->this$0:Lexpo/modules/contacts/ContactsModule;

    .line 155
    .line 156
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 157
    .line 158
    invoke-static {p1, v0}, Lexpo/modules/contacts/ContactsModule;->access$getAllContactsAsync(Lexpo/modules/contacts/ContactsModule;Lexpo/modules/contacts/ContactQuery;)Lexpo/modules/contacts/ContactPage;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_3
    iget-object v0, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 163
    .line 164
    iget-object v1, p0, Lexpo/modules/contacts/ContactsModule$definition$1$6$1;->$options:Lexpo/modules/contacts/ContactQuery;

    .line 165
    .line 166
    invoke-virtual {v1}, Lexpo/modules/contacts/ContactQuery;->getFields()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {p1, v1}, Lexpo/modules/contacts/ContactsModuleKt;->toBundle(Lexpo/modules/contacts/ContactPage;Ljava/util/Set;)Landroid/os/Bundle;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-interface {v0, p1}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object p1, Li7/B;->a:Li7/B;

    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 183
    .line 184
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1
.end method
