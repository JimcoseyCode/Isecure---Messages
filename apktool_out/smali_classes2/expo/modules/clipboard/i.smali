.class public final synthetic Lexpo/modules/clipboard/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lexpo/modules/clipboard/ClipboardModule;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/clipboard/ClipboardModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/clipboard/i;->g:Lexpo/modules/clipboard/ClipboardModule;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/clipboard/i;->g:Lexpo/modules/clipboard/ClipboardModule;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/clipboard/ClipboardModule;->b(Lexpo/modules/clipboard/ClipboardModule;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
