.class final Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/domain/ContactRepository;->patch(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "",
        "<anonymous>",
        "(LR8/N;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.domain.ContactRepository$patch$2"
    f = "ContactRepository.kt"
    l = {
        0x31,
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method constructor <init>(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

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
    new-instance p1, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;-><init>(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->label:I

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$2:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/List;

    .line 33
    .line 34
    iget-object v5, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$1:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Ljava/util/Set;

    .line 37
    .line 38
    iget-object v6, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, Ljava/util/List;

    .line 41
    .line 42
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 51
    .line 52
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;->toPatchOperations()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lj7/q;->R0(Ljava/util/Collection;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 61
    .line 62
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;->getToUpdate()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v5, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    instance-of v7, v6, Lexpo/modules/contacts/next/domain/model/Updatable$Data;

    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {v5, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-direct {p1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Lexpo/modules/contacts/next/domain/model/Updatable$Data;

    .line 117
    .line 118
    invoke-interface {v6}, Lexpo/modules/contacts/next/domain/model/Updatable$Data;->getDataId-sXKVoX8()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->box-impl(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/wrappers/DataId;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-interface {p1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-static {p1}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 135
    .line 136
    iget-object v6, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 137
    .line 138
    invoke-virtual {v6}, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;->getContactId-S9XCBSM()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iget-object v7, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->$contactPatch:Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 143
    .line 144
    invoke-virtual {v7}, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;->getModifiedFields()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v5, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    iput v4, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->label:I

    .line 155
    .line 156
    invoke-static {p1, v6, v7, p0}, Lexpo/modules/contacts/next/domain/ContactRepository;->access$getDataIds-0xh38yw(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_6

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_6
    move-object v6, v1

    .line 164
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    .line 165
    .line 166
    invoke-static {p1, v5}, Lj7/q;->v0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v5, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_7

    .line 188
    .line 189
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lexpo/modules/contacts/next/domain/wrappers/DataId;

    .line 194
    .line 195
    invoke-virtual {v2}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->unbox-impl()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v7, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    .line 200
    .line 201
    invoke-static {v7}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    const-string v8, "_id = ?"

    .line 206
    .line 207
    filled-new-array {v2}, [Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v7, v8, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const-string v7, "build(...)"

    .line 220
    .line 221
    invoke-static {v2, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_7
    invoke-interface {v1, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 232
    .line 233
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    const/4 v1, 0x0

    .line 238
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$0:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->L$2:Ljava/lang/Object;

    .line 243
    .line 244
    iput v3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;->label:I

    .line 245
    .line 246
    const-string v1, "com.android.contacts"

    .line 247
    .line 248
    invoke-static {p1, v1, v6, p0}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeApplyBatch(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-ne p1, v0, :cond_8

    .line 253
    .line 254
    :goto_4
    return-object v0

    .line 255
    :cond_8
    :goto_5
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    return-object p1
.end method
