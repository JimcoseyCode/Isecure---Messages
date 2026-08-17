.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->move-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
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
    c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$move$2"
    f = "AssetLegacyDelegate.kt"
    l = {
        0xb9,
        0xbd
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
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->$relativePath:Ljava/lang/String;

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
    new-instance p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->$relativePath:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ljava/lang/String;Ln7/f;)V

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->label:I

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
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 36
    .line 37
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;->requireWritePermissions()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 45
    .line 46
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Landroid/content/ContentResolver;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 51
    .line 52
    invoke-virtual {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->label:I

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetData(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    new-instance v1, Ljava/io/File;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Ljava/io/File;

    .line 75
    .line 76
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->$relativePath:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v5}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toFilePath-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2}, Lexpo/modules/medialibrary/next/extensions/FileExtensionsKt;->safeMove(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 90
    .line 91
    invoke-static {v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Landroid/content/ContentResolver;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->deleteBy(Landroid/content/ContentResolver;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 99
    .line 100
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$getContextRef$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "getPath(...)"

    .line 113
    .line 114
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iput v3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->label:I

    .line 118
    .line 119
    invoke-static {p1, v1, v4, p0}, Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt;->scanFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v0, :cond_4

    .line 124
    .line 125
    :goto_1
    return-object v0

    .line 126
    :cond_4
    :goto_2
    check-cast p1, Lkotlin/Pair;

    .line 127
    .line 128
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Landroid/net/Uri;

    .line 133
    .line 134
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    invoke-static {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->access$setContentUri$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Landroid/net/Uri;)V

    .line 139
    .line 140
    .line 141
    sget-object p1, Li7/B;->a:Li7/B;

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_5
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetCouldNotBeCreated;

    .line 145
    .line 146
    const-string v0, "Could not create a new asset while moving the old one"

    .line 147
    .line 148
    invoke-direct {p1, v0, v4, v3, v4}, Lexpo/modules/medialibrary/next/exceptions/AssetCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 153
    .line 154
    const-string v0, "Asset path"

    .line 155
    .line 156
    invoke-direct {p1, v0, v4, v3, v4}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 157
    .line 158
    .line 159
    throw p1
.end method
