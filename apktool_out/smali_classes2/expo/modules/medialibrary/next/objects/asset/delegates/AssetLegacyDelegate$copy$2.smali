.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->copy-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
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
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
        "<anonymous>",
        "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$copy$2"
    f = "AssetLegacyDelegate.kt"
    l = {
        0xc3,
        0xc6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $relativePath:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->$relativePath:Ljava/lang/String;

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
    new-instance p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->$relativePath:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ljava/lang/String;Ln7/f;)V

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 36
    .line 37
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Landroid/content/ContentResolver;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 42
    .line 43
    invoke-virtual {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->label:I

    .line 48
    .line 49
    invoke-static {p1, v1, p0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetData(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    new-instance v1, Ljava/io/File;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Ljava/io/File;

    .line 66
    .line 67
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->$relativePath:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v2}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toFilePath-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, p1}, Lexpo/modules/medialibrary/next/extensions/FileExtensionsKt;->safeCopy(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 81
    .line 82
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContextRef$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Ljava/lang/ref/WeakReference;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v2, "getPath(...)"

    .line 95
    .line 96
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput v3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->label:I

    .line 100
    .line 101
    invoke-static {v1, p1, v4, p0}, Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt;->scanFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v0, :cond_4

    .line 106
    .line 107
    :goto_1
    return-object v0

    .line 108
    :cond_4
    :goto_2
    check-cast p1, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Landroid/net/Uri;

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    new-instance p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 119
    .line 120
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 121
    .line 122
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 127
    .line 128
    invoke-virtual {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 133
    .line 134
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget-object v3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 139
    .line 140
    invoke-static {v3}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContextRef$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Ljava/lang/ref/WeakReference;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {v3}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-direct {p1, v0, v1, v2, v3}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;-><init>(Landroid/net/Uri;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 152
    .line 153
    invoke-direct {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/Asset;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_5
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetCouldNotBeCreated;

    .line 158
    .line 159
    const-string v0, "Could not create a new asset while copying the old one"

    .line 160
    .line 161
    invoke-direct {p1, v0, v4, v3, v4}, Lexpo/modules/medialibrary/next/exceptions/AssetCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 166
    .line 167
    const-string v0, "Asset path"

    .line 168
    .line 169
    invoke-direct {p1, v0, v4, v3, v4}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method
