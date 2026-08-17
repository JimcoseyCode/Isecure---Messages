.class public final Lcom/facebook/react/views/text/ReactFontManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/ReactFontManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ-\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u0012J-\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u0013J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0019\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/facebook/react/views/text/ReactFontManager;",
        "",
        "Lcom/facebook/react/common/assets/ReactFontManager;",
        "delegate",
        "<init>",
        "(Lcom/facebook/react/common/assets/ReactFontManager;)V",
        "",
        "fontFamilyName",
        "",
        "style",
        "Landroid/content/res/AssetManager;",
        "assetManager",
        "Landroid/graphics/Typeface;",
        "getTypeface",
        "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;",
        "weight",
        "",
        "italic",
        "(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;",
        "(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;",
        "Landroid/content/Context;",
        "context",
        "fontFamily",
        "fontId",
        "Li7/B;",
        "addCustomFont",
        "(Landroid/content/Context;Ljava/lang/String;I)V",
        "font",
        "(Ljava/lang/String;Landroid/graphics/Typeface;)V",
        "typeface",
        "setTypeface",
        "(Ljava/lang/String;ILandroid/graphics/Typeface;)V",
        "Lcom/facebook/react/common/assets/ReactFontManager;",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/text/ReactFontManager$Companion;

.field private static instance:Lcom/facebook/react/views/text/ReactFontManager;


# instance fields
.field private final delegate:Lcom/facebook/react/common/assets/ReactFontManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/ReactFontManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/ReactFontManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/ReactFontManager;->Companion:Lcom/facebook/react/views/text/ReactFontManager$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/common/assets/ReactFontManager;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/common/assets/ReactFontManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/ReactFontManager;-><init>(Lcom/facebook/react/common/assets/ReactFontManager;)V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/facebook/react/views/text/ReactFontManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/ReactFontManager;->instance:Lcom/facebook/react/views/text/ReactFontManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/facebook/react/views/text/ReactFontManager;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/facebook/react/views/text/ReactFontManager;->instance:Lcom/facebook/react/views/text/ReactFontManager;

    .line 2
    .line 3
    return-void
.end method

.method public static final getInstance()Lcom/facebook/react/views/text/ReactFontManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/ReactFontManager;->Companion:Lcom/facebook/react/views/text/ReactFontManager$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/text/ReactFontManager$Companion;->getInstance()Lcom/facebook/react/views/text/ReactFontManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final addCustomFont(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontFamily"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/common/assets/ReactFontManager;->addCustomFont(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public final addCustomFont(Ljava/lang/String;Landroid/graphics/Typeface;)V
    .locals 1

    const-string v0, "fontFamily"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/common/assets/ReactFontManager;->addCustomFont(Ljava/lang/String;Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final getTypeface(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    const-string v0, "fontFamilyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assetManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/common/assets/ReactFontManager;->getTypeface(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    const-string v0, "fontFamilyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assetManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/common/assets/ReactFontManager;->getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final getTypeface(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    const-string v0, "fontFamilyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assetManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/common/assets/ReactFontManager;->getTypeface(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final setTypeface(Ljava/lang/String;ILandroid/graphics/Typeface;)V
    .locals 1

    .line 1
    const-string v0, "fontFamilyName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeface"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager;->delegate:Lcom/facebook/react/common/assets/ReactFontManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/common/assets/ReactFontManager;->setTypeface(Ljava/lang/String;ILandroid/graphics/Typeface;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
