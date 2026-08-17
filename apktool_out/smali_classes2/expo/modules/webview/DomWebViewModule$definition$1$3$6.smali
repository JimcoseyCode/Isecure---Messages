.class final Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/webview/DomWebViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/webview/DomWebView;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;->invoke(Lexpo/modules/webview/DomWebView;Z)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke(Lexpo/modules/webview/DomWebView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lexpo/modules/webview/DomWebView;->setNestedScrollEnabled(Z)V

    return-void
.end method
