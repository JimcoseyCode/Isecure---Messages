.class public final synthetic Lexpo/modules/adapters/react/apploader/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/ReactHost;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/ReactHost;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/adapters/react/apploader/b;->g:Lcom/facebook/react/ReactHost;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/apploader/b;->g:Lcom/facebook/react/ReactHost;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/adapters/react/apploader/RNHeadlessAppLoader;->a(Lcom/facebook/react/ReactHost;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
