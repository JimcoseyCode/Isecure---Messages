.class public final synthetic Lexpo/modules/fetch/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lexpo/modules/fetch/ExpoFetchModule;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/fetch/ExpoFetchModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/fetch/c;->g:Lexpo/modules/fetch/ExpoFetchModule;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/c;->g:Lexpo/modules/fetch/ExpoFetchModule;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/fetch/ExpoFetchModule;->b(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
